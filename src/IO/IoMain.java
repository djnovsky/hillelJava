package IO;

import OOP.inheritance.hierarchy.Person;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Properties;

/**
 * Created by User on 15.04.2016.
 */
public class IoMain {
    public static void main(String[] args) {


       /*Person ivan = new Person("Ivan"); //ctrl+alt+v - выделить в новую переменную
        Car myCar = new Car("BMW", 1985, ivan);
        ivan.setCar(myCar);
        myCar.setTenant(new Tenant("Nikolai"));

        carSave(myCar);*/




        Car deserializedCar = carLoad();

        System.out.println(deserializedCar.toString() + "\n" + LocalDateTime.now());
        //System.out.println(deserializedCar == myCar);


    }

    public static void carSave(Car car) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("myFolder/car.dat"/*,true*/))) {
            outputStream.writeObject(car);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Car carLoad() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("myFolder/car.dat"))) {
            return (Car) objectInputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e.getCause()); //оборачивания Checked Exception в UncheckedException
        }
    }

    private static void propertiesExample() {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("myFolder/settings.properties")) {
            properties.load(fileInputStream);
            String db = properties.getProperty("DB");
            String password = properties.getProperty("password");
            int timeout = Integer.parseInt(properties.getProperty("timeout"));

            System.out.println(db + " " + password + " " + timeout);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void objectsExample() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("myFolder/primitives.dat"))) {
            int[] date = new int[]{15, 4, 2016};

            outputStream.writeObject(date);
            outputStream.writeObject("hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("myFolder/primitives.dat"))) {
            int[] date = (int[]) inputStream.readObject();
            System.out.println(Arrays.toString(date));
            String someStr = (String) inputStream.readObject();
            System.out.println(Objects.toString(someStr));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void dataWriter() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("myFolder/primitives.dat"))) {
            dataOutputStream.writeInt(15);
            dataOutputStream.writeInt(4);
            dataOutputStream.writeInt(2016);
            dataOutputStream.writeLong(Long.MAX_VALUE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dataReader() {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("myFolder/primitives.dat"))) {
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            //System.out.println(dataInputStream.readLong());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedRead() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("myFolder/myFile.txt"), "windows-1251"))) {
            String value = null;
            while ((value = reader.readLine()) != null) {
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readWithCodePage() {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("myFolder/myFile.txt"), "windows-1251")) {
            int value = 0;
            while ((value = reader.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("myFolder/myFile.txt"), "windows-1251") {
//            int value = 0;
//            while((value = reader.read())!=1){
//                System.out.println((char) value);
//            }
//        }catch(UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    } //errors, find out why??

    private static void copy() {
        try (InputStream inputStream = new FileInputStream("myFolder/myFile.txt");
             OutputStream outputStream = new FileOutputStream("myFolder/myFile.txt")
        ) {
            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    private static void tryWithResources() {
        try (InputStream inputStream = new FileInputStream("myFolder/myFile.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void uglyPriorJava7Style() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("myFolder/myFile.txt");
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void filesAndPaths() {
        File file = new File("/temp/myFolder2");
        System.out.println(file.exists());
        file.mkdirs();
        System.out.println(file.exists());

        File relativeFile = new File("myFolder/myFile.txt");
        System.out.println(relativeFile.getAbsolutePath());

        Path relativePath = Paths.get("myFolder/myFile.txt");
        Path parent = relativePath.getParent();
        Path resolve = parent.resolve(relativePath);
        System.out.println(parent);
        System.out.println(resolve);
        Path absolutePath = relativePath.toAbsolutePath();
        System.out.println("absolute " + absolutePath + ", is absolute " + absolutePath.isAbsolute());
        System.out.println("relative: " + relativePath + ", is absolute " + relativePath.isAbsolute());


        try {
            Files.createDirectories(relativePath.getParent());
            Files.createFile(relativePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void someMethodCaller() {
        someMethod(1, 2, 3, 5, 6, 7);
    }

    public static void someMethod(Integer... integers) {
        System.out.println(integers[0]);
        System.out.println(integers[1]);
        System.out.println(integers[2]);
    }
}

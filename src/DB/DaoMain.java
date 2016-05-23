package DB;

/**
 * Created by User on 23.05.2016.
 */
public class DaoMain {
    public static void main(String[] args) {
        DAO DAO = new ProductMemoryDAO();
        workWithProducts(DAO);


    }

    private static void workWithProducts(DAO DAO) {
        Product product = DAO.findById(3);
        System.out.println("id = 3: " + product);

        product.setName("Crocodile");

        DAO.update(product);

        System.out.println("after croco update " + DAO.findAll());

        DAO.delete(product);

        DAO.create(new Product(5, "Giraffe", "African animal", 27000));

        System.out.println("after croco delete, giraffe insert: " + DAO.findAll());
    }
}

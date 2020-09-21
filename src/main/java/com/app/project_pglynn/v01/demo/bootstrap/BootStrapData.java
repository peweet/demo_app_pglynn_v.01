package com.app.project_pglynn.v01.demo.bootstrap;
/*
@Component

public class BootStrapData implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Spring5webappApplication.class);


    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final ProductRepository productRepository;
    private final EmployeeRepository employeeRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         ProductRepository productRepository, EmployeeRepository employeeRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.productRepository = productRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in bootstrap class");
        Product publisher = new Product();
        //publisher.setName("Faber & Faber");
        //publisher.setCity("London");
        //publisher.setState("Essex");
        //publisher.setCountry("UK");
        productRepository.save(publisher);

        System.out.println("Publisher count" +  productRepository.count());
        Author cormac = new Author("Cormac", "McCarthy");
        Book bloodMerdiain = new Book("Blood Meridian", "12345");
        cormac.getBooks().add(bloodMerdiain);
        bloodMerdiain.getAuthors().add(cormac);

        //bloodMerdiain.setProduct(publisher);
        authorRepository.save(cormac);
        //publisher.getBooks().add(bloodMerdiain);
        bookRepository.save(bloodMerdiain);
        productRepository.save(publisher);

        log.info("-------Publisher object loaded and saved");
        log.info("-------------------------------");
        Author james = new Author("James", "Joyce");
        /*
        Product dubliners = new Product("Dubliners", "Ireland", "Dublin");
        //james.getBooks().add(dubliners);
       // dubliners.setProduct(publisher);
        //publisher.getProduct().add(dubliners);
        Employee firstEmployee = new Employee("Patrick", "Developer");

        authorRepository.save(james);
       // bookRepository.save(dubliners);
        productRepository.save(publisher);
        employeeRepository.save(firstEmployee);
        log.info("-----------Author object loaded and saved");

        log.info("---------------------------------");
        System.out.println("Number of books" + bookRepository.count());
        System.out.println("Publisher Number of product "+ productRepository.count() +
                " " + publisher.Product().size());
        log.info("-----------------------------------");
        log.info(firstEmployee.toString());
        log.info("");



    }
}
*/


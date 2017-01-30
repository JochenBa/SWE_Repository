import org.junit.*;


public class RechteckTest {
  
  private static Rechteck myRechteck;
  
  @BeforeClass
  public static void create() {
    myRechteck = new Rechteck(10, 20);
    System.out.println("Start!");   
  }
  
  @Before
  public void vor() {
    System.out.println("vor Test");
  }
  
  @Test
  public void derTest1() {
    System.out.println("Test1");
    Assert.assertTrue(60 == myRechteck.berechneUmfang());   
  }
  
  @Test
  public void derTest2() {
    System.out.println("Test2");
    Assert.assertNotNull(myRechteck.berechneInhalt());  
  }
  
  @After
  public void nach() {
    System.out.println("nach Test");
  }
  
  @AfterClass
  public static void delete() {
    System.out.println("Test Ende!");
  }

  
  
}

  

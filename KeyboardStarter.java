class KeyboardStarter{

 public static void main(String[] args)
 {
 System.out.println("Starting of KeyboardStarter ");
  Keyboard keyboard = new Keyboard();
  System.out.println("keyboard brand is"+keyboard.brand);
  System.out.println("keyboard color is"+keyboard.color);
  System.out.println("keyboard noOfKeys is"+keyboard.noOfKeys);
  System.out.println("keyboard type is"+keyboard.type);
  System.out.println("keyboard cost is"+keyboard.cost);
  
  Keyboard keyboard1 = new Keyboard("korg");
  System.out.println("keyboard brand is"+keyboard1.brand);
  System.out.println("keyboard color is"+keyboard1.color);
  System.out.println("keyboard noOfKeys is"+keyboard1.noOfKeys);
  System.out.println("keyboard type is"+keyboard1.type);
  System.out.println("keyboard cost is"+keyboard1.cost);
  
  Keyboard keyboard2 = new Keyboard("yamaha","black");
  System.out.println("keyboard brand is"+keyboard2.brand);
  System.out.println("keyboard color is"+keyboard2.color);
  System.out.println("keyboard noOfKeys is"+keyboard2.noOfKeys);
  System.out.println("keyboard type is"+keyboard2.type);
  System.out.println("keyboard cost is"+keyboard2.cost);
  
  Keyboard keyboard3 = new Keyboard("yamaha","blue",101);
  System.out.println("keyboard brand is"+keyboard3.brand);
  System.out.println("keyboard color is"+keyboard3.color);
  System.out.println("keyboard noOfKeys is"+keyboard3.noOfKeys);
  System.out.println("keyboard type is"+keyboard3.type);
  System.out.println("keyboard cost is"+keyboard3.cost);
  
  Keyboard keyboard4 = new Keyboard("yamaha","blue",101,"apple");
  System.out.println("keyboard brand is"+keyboard4.brand);
  System.out.println("keyboard color is"+keyboard4.color);
  System.out.println("keyboard noOfKeys is"+keyboard4.noOfKeys);
  System.out.println("keyboard type is"+keyboard4.type);
  System.out.println("keyboard cost is"+keyboard4.cost);
  
  Keyboard keyboard5 = new Keyboard("yamaha","blue",101,"membrane",1000.0);
  System.out.println("keyboard brand is"+keyboard5.brand);
  System.out.println("keyboard color is"+keyboard5.color);
  System.out.println("keyboard noOfKeys is"+keyboard5.noOfKeys);
  System.out.println("keyboard type is"+keyboard5.type);
  System.out.println("keyboard cost is"+keyboard5.cost);
  
  System.out.println("Starting of KeyboardStarter ");
 }
}
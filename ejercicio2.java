public static void main(String[] args) {
  
  Linked list = new Linkedlist();
  lista.add(1);
  lista.add(4);
  lista.add(5);
  lista.add(10);
  Iterator ite = list.iterator();
  // como ite es un objeto nodo se necesita castear como un int
  // solo se diferencia del array por el casteo
  int a = (int)ite.next();
  System.out.println("a: " + a);
  a = (int) ite.next();
  System.out.println("a: " + a);
  while(ite.hasNext()){
    a = (int) ite.next();
    System.out.Println("a: " + a);
  }
  
  LinkedList numeros = new LinkedList();
  for(int i = 5; i <= 30; i+=5){
      numeros.add(i);
  }
  ite = numeros.iterator();
  // remover el 3 en adelante
  ite.hasNext();
  ite.hasNext();
  ite.hasNext();
  while(ite.hasNext()){
    iter.remove();
  
  }
  
  // Ejercicio 1: recursion
  public static int suma(int numero){
    if (numero == 0){
       return;
    }
     int digito = numero % 10;
     int restante = numero / 10;
     return suma(restante) + digito;
    // retun 2+1+2+(suma(10))
    // 2+1+2+0+(suma(1))
  
  }
  
  
  
  
  // Ejercicio 1
  
  ArrayList<Integer> lista = new ArrayList<>();
  lista.add("manzana");
  lista.add("sandia");
  lista.add("naranja");
  lista.add("platano");
  
  Iterator<String> iter = lista.iterator();
  
 
  iter.remove(1);
  /*
  iter.next();
  iter.next();
  iter.remove();
  */
  iter = lista.iterator();
  
  while(iter.hasNext()){
    String aa = iter.next();
    System.out.println("valor: "+aa);
  
  }

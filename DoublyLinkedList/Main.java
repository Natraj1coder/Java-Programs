package DoublyLinkedList;

class Main {
    public static void main(String[] args) {
      Doubly dll = new Doubly();
      dll.createDLL(1);
      dll.insertDLL(2, 0);
      dll.insertDLL(3, 1);
      dll.insertDLL(4, 7);
      dll.traverseDLL();
      dll.deleteDLL();
      dll.traverseDLL();
    }
  }
  
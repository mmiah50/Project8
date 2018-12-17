package nested;

public class Outter {
   private InnerB innerB = new InnerB();


    public class InnerA{

        public void callInner(){
            InnerB innerB = new InnerB();
        }

    }

    private class InnerB{

    }
}

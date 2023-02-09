

public class Main {
    public static void main(String[] args) {
        try {
            MyIndividual mySortingInstance = new MyIndividual(args);
            System.out.println("UNSORTED ARRAY:");
            System.out.println(mySortingInstance.numArray);
            System.out.println("SORTED ARRAY:");
            System.out.println(mySortingInstance.get_sorted());
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }
}
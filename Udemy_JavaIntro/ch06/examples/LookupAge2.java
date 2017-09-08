package examples;

public class LookupAge2 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java LookupAge1 name+");
        }
        else {
            String name[] = { "Henry", "Blanche", "William" };
            int age[] = { 53, 49, 17 };

            argumentLoop: for (String request : args) {

                nameLoop: // search for args[a] in name[]
                for (int n = 0; n < name.length; n++) {
                    if (request.equals(name[n])) {
                        System.out.println(request + ": " + age[n]);
                        continue argumentLoop;
                    }
                }
                System.out.println(request + " not found");
            }
        }
    }
}

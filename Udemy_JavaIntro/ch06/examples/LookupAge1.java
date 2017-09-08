package examples;

public class LookupAge1 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java LookupAge1 name+");
        }
        else {
            String name[] = { "Henry", "Blanche", "William" };
            int age[] = { 53, 49, 17 };

            // Note: if not using array initialization like that above,
            // we end up with less-readable code that (at best) looks
            // something like this:
            // int max = 3;
            // String name[] = new String[max];
            // int age[] = new int[max];
            // name[0] = "Henry";
            // age[0] = 53;
            // name[1] = "Blanche";
            // age[1] = 49;
            // name[2] = "William";
            // age[2] = 17;

            argumentLoop: for (int a = 0; a < args.length; a++) {

                nameLoop: // search for args[a] in name[]
                for (int n = 0; n < name.length; n++) {
                    if (name[n].equals(args[a])) {
                        System.out.println(name[n] + ": " + age[n]);
                        continue argumentLoop;
                    }
                }
                System.out.println(args[a] + " not found");
            }
        }
    }
}

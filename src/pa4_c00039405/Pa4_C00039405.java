// Your Name: Coadiey Bryan
// Your ID: C00039405
// CMPS 260
// Programming Assignment : #4
// Due Date : 3/13/18 
// Program Description: creates an array to user specification,
// intitializes objects to use in the elements of the array, uses this information in another class
// in another file in the package, uses this information to give the total and percentages of all volumes of sand or clay.
// Certificate of Authenticity:
// I certify that the code in the method function main of this project is entirely my own
// work.
package pa4_c00039405;

/**
 *
 * @author CodyB
 */
public class Pa4_C00039405 {

    static Dirt[] makeArray(int size) {
        if (size < 2) {
            return null;
        }
        Dirt[] dirtA = new Dirt[size];
        return dirtA;
    }

    static Dirt[] settingArray(Dirt[] newDirtArray, int size, java.util.Scanner keyboard) {
        int i;
        for (i = 0; i < size; i++) {
            float a = keyboard.nextFloat();
            float b = keyboard.nextFloat();
            Dirt newDirt = new Dirt(a, b);
            newDirt.setClay(a);
            newDirt.setSand(b);
            newDirtArray[i] = newDirt;
        }
        return newDirtArray;
    }

    static int avgPerS(Dirt[] oldDirtArray, int size) {
        int i;
        int sum = 0;
        for (i = 0; i < size; i++) {
            sum += oldDirtArray[i].perS();
        }
        int totalP = sum / i;
        return totalP;
    }

    static int avgPerC(Dirt[] oldDirtArray, int size) {
        int i;
        int sum = 0;
        for (i = 0; i < size; i++) {
            sum += oldDirtArray[i].perC();
        }
        int totalP = sum / i;
        return totalP;
    }

    public static void main(String[] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.print("Please determine the size of your new array(# > 1): ");
        int size = keyboard.nextInt();
        if (size > 1) {
            System.out.println();
            int i = 0;
            for (; i < size; i++) {
                System.out.printf("Enter sample %d clay volume: ", i + 1);
                System.out.println();
                System.out.printf("Enter sample %d sand volume: ", i + 1);
                System.out.println();
            }
            Dirt[] newDirtArray = makeArray(size);
            Dirt[] oldDirtArray = settingArray(newDirtArray, size, keyboard);
            System.out.println();
            System.out.println("Volume Table");
            System.out.printf("%6s", "Sample");
            System.out.printf("%6s", "Clay");
            System.out.printf("%7s %3s", "Sand", "");
            System.out.println("Total");
            for (i = 0; i < size; i++) {
                System.out.printf("%3d %4s", i + 1, "");
                System.out.printf("%1.2f %3s", oldDirtArray[i].getSand(), "");
                System.out.printf("%1.2f %3s", oldDirtArray[i].getClay(), "");
                System.out.printf("%1.2f", oldDirtArray[i].total());
                System.out.println();
            }
            float apc = avgPerC(oldDirtArray, size);
            float aps = avgPerS(oldDirtArray, size);
            System.out.printf("%2.2f %3s", aps, "Percent Sand");
            System.out.println();
            System.out.printf("%2.2f %3s", apc, "Percent Clay");
            System.out.println();
        }
    }
}

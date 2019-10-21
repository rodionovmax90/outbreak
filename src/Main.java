public class Main {


    public static void main(String[] args) {

        System.out.println("\nStep #1. Checking outbreak by vertical");
        int[][] verticalTrue = Outbreak.convertArrayFromObjectToInt(Room.verticalTrue);
        Outbreak.printArray(verticalTrue);
        Outbreak.isThereAnOutbreak(verticalTrue);

        System.out.println("\nStep #2. Checking outbreak by horizontal");
        int[][] horizontalTrue = Outbreak.convertArrayFromObjectToInt(Room.horizontalTrue);
        Outbreak.printArray(horizontalTrue);
        Outbreak.isThereAnOutbreak(horizontalTrue);

        System.out.println("\nStep #3. Finding potential spot there outbreak could happen");
        int[][] result = Outbreak.findPotentialSpot(verticalTrue, horizontalTrue);
        Outbreak.printArray(result);

        System.out.println("\nStep #4. Verifying is potential spot infected");
        int[][] spot = Outbreak.verifyIsPotentialSpotInfected(result, Outbreak.convertArrayFromObjectToInt(Room.noInfection));
        Outbreak.printArray(spot);

        System.out.println("\nStep #5. Analyzing results and locating outbreak location");
        Outbreak.findOutbreak(spot);

    }

}


import java.util.Random;
void main() {
    Random rand = new Random();
    int rollCount = 0;
    int die1, die2, die3;
    int sum;
    System.out.printf("Roll \tDie1 \tDie2 \tDie3 \tSum");
    System.out.println();
    System.out.println("-------------------------------------------------");

    do {
            rollCount++;
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            die3 = rand.nextInt(6) + 1;

            sum = die1 + die2 + die3;
            System.out.printf(rollCount + "\t" + die1 + "\t" + die2 + "\t" + die3 + "\t" + sum);
            System.out.println();
    } while (!(die1 == die2 && die2 == die3));
}
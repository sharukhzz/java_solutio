import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Range {
    int start;
    int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean overlaps(Range other) {
        return start <= other.end && other.start <= end;
    }

    public void merge(Range other) {
        start = Math.min(start, other.start);
        end = Math.max(end, other.end);
    }
    public String toString() {
        return start + "-" + end ;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Range> ranges = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nIteration " + (ranges.size() + 1) + ":");
            System.out.print("Enter Start Range : ");
            int start = scanner.nextInt();
            if (start == -1) {
                break;
            }

            System.out.print("Enter End Range : ");
            int end = scanner.nextInt();

            Range newRange = new Range(start, end);
            mergeRanges(ranges, newRange);

            System.out.println("\nRange\tValue");
            for (Range range : ranges) {
                System.out.println(range);
            }
        }
    }

    private static void mergeRanges(List<Range> ranges, Range newRange) {
        List<Range> overlappingRanges = new ArrayList<>();

        for (Range er : ranges) {
            if (er.overlaps(newRange)) {
                overlappingRanges.add(er);
            }
        }

        for (Range or : overlappingRanges) {
            ranges.remove(or);
            newRange.merge(or);
        }

        ranges.add(newRange);
    }
}

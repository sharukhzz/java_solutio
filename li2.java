import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Range {
    int sr;
    int er;

    public Range(int sr, int er)
	{
        this.sr = sr;
        this.er = er;
    }

    public boolean overlaps(Range other) 
	{
        return sr <= other.er && other.sr <= er;
    }

    public void merge(Range other)
	{
        sr = Math.min(sr, other.sr);
        er = Math.max(er, other.er);
    }
    public String toString() 
	{
        return sr + "-" + er;
    }
}

public class li2 {
    public static void main(String[] args) {
        List<Range> val = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nIteration " + (val.size() + 1) + ":");
            int sr = scanner.nextInt();
            if (sr == -1) {
                break;
            }
            int er = scanner.nextInt();
            Range newRange = new Range(sr, er);
            mergeRanges(val, newRange);
            System.out.println("\nRange\tValue");
            for (Range range : val) {
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

        for (Range overlappingRange : overlappingRanges) {
            ranges.remove(overlappingRange);
            newRange.merge(overlappingRange);
        }

        ranges.add(newRange);
    }
}

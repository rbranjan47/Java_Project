package Methods;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class generateCalnderMonths {

    public enum DurationFilter {
        YTD, LAST_3_MONTHS, LAST_6_MONTHS, LAST_1_YEAR, LAST_2_YEARS, LAST_3_YEARS
    }

    private final Map<DurationFilter, Integer> filterMonthsMap = Map.of(
            DurationFilter.YTD, 0,           // Special case
            DurationFilter.LAST_3_MONTHS, 3,
            DurationFilter.LAST_6_MONTHS, 6,
            DurationFilter.LAST_1_YEAR, 12,
            DurationFilter.LAST_2_YEARS, 24,
            DurationFilter.LAST_3_YEARS, 36
    );

    public List<String> getMonthsByFilter(DurationFilter filter) {
        LocalDate today = LocalDate.now();
        LocalDate start;

        if (filter == DurationFilter.YTD) {
            // For YTD, we calculate from Jan 1st of current year to today
            start = LocalDate.of(today.getYear(), 1, 1);
        } else {
            int monthsBack = filterMonthsMap.getOrDefault(filter, 0);
            start = today.minusMonths(monthsBack).withDayOfMonth(1);
        }

        return getFormattedMonths(start, today);
    }

    private List<String> getFormattedMonths(LocalDate start, LocalDate end) {
        List<String> months = new ArrayList<>();

        // Use TemporalAdjusters to go through each month from start to end
        LocalDate current = start;

        // Loop until the current date exceeds the end date
        while (!current.isAfter(end)) {
            String monthStr = current.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

            // Add the year only for the first month or when it's January
            if (current.getMonthValue() == 1 || months.isEmpty()) {
                monthStr += " " + current.getYear();
            }

            months.add(monthStr);

            // Move to next month
            current = current.plusMonths(1);
        }

        return months;
    }

    public static void main(String[] args) {
        generateCalnderMonths gg = new generateCalnderMonths();
        System.out.println("YTD: " + gg.getMonthsByFilter(DurationFilter.YTD));
        System.out.println("Last 3 Months: " + gg.getMonthsByFilter(DurationFilter.LAST_3_MONTHS));
        System.out.println("Last 6 Months: " + gg.getMonthsByFilter(DurationFilter.LAST_6_MONTHS));
        System.out.println("Last 1 Year: " + gg.getMonthsByFilter(DurationFilter.LAST_1_YEAR));
        System.out.println("Last 2 Years: " + gg.getMonthsByFilter(DurationFilter.LAST_2_YEARS));
        System.out.println("Last 3 Years: " + gg.getMonthsByFilter(DurationFilter.LAST_3_YEARS));
    }
}



interface weekInterface
{
    Day getDay(int dayIndex);
    String getDayInfo(int index);
}



class Week implements weekInterface
{
    Day[] daysOfTheWeek = {Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};

    public Day getDay(int dayIndex)
    {
        return daysOfTheWeek[dayIndex];
    }

    public String getDayInfo(int index)
    {
        switch (index)
        {
            case 1: return " are sunny.";
            case 2: return " are nice.";
            case 3: return " are cold";
            case 4: return " are average";
            default: return " missing index";
        }
    }
}

class DayInformation extends Week
{
    Day today;
    public DayInformation(int index)
    {
        today = getDay(index);
        switchStatement();
    }

    public DayInformation(Day _today)
    {
        this.today = _today;
        switchStatement();

    }

    private void switchStatement()
    {
        switch (this.today)
        {
            case MONDAY:
                System.out.println("Mondays" + getDayInfo(this.today.index()));
                break;

            case TUESDAY:
                System.out.println("Tuesdays" + getDayInfo(this.today.index()));
                break;

            case WEDNESDAY:
                System.out.println("Wednesdays" + getDayInfo(this.today.index()));
                break;

            case THURSDAY:
                System.out.println("Thursdays" + getDayInfo(this.today.index()));
                break;

            case FRIDAY:
                System.out.println("Fridays" + getDayInfo(this.today.index()));
                break;

            case SATURDAY:
                System.out.println("Saturdays" + getDayInfo(this.today.index()));
                break;

            case SUNDAY:
                System.out.println("Sundays" + getDayInfo(this.today.index()));
                break;
        }
    }
}


class weekFour
{
    public static void main(String[] args)
    {
        DayInformation firstDay = new DayInformation(0);
        DayInformation second = new DayInformation(1);
        DayInformation third = new DayInformation(2);
        DayInformation fourth = new DayInformation(Day.THURSDAY);
        DayInformation fifth = new DayInformation(Day.FRIDAY);
        DayInformation sixth = new DayInformation(Day.SATURDAY);
        DayInformation seventh = new DayInformation(6);
    }
}
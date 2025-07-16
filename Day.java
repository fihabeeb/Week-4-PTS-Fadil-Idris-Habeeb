public enum Day
{
   MONDAY (2), TUESDAY (1), WEDNESDAY (3), THURSDAY (4), FRIDAY (2), SATURDAY (3),  SUNDAY (1);

    private int infoIndex = 1;

    Day(int value)
    {
        this.infoIndex = value;
    }

    public int index() { return infoIndex;}
}
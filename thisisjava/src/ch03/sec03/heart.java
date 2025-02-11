package ch03.sec03;
public class heart {
    public static void main(String[] args) {
        String[] heart = {
            "   @   @       @   @   ",
            "  @@@ @@@     @@@ @@@  ",
            "  @@@@@@@@@@@@@@@@@@@  ",
            "   @@@@@@@@@@@@@@@@@   ",
            "    @@@@@@@@@@@@@@@    ",
            "     @@@@@@@@@@@@@     ",
            "      @@@@@@@@@@@      ",
            "       @@@@@@@@@       ",
            "        @@@@@@@        ",
            "         @@@@@         ",
            "          @@@          ",
            "           @           "
        };

        for (String line : heart) {
            System.out.println(line);
        }
    }
}

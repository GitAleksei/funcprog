package ru.netology.task1;

/**
 * Dictionary generator
 *
 */
public class App 
{

    private static final String INPUT_TEXT = "Learn Git and GitHub without any code!" +
            "Using the Hello World guide, you’ll create a repository, start a branch, s write " +
            "comments, and open a pull request. ";

    public static void main( String[] args )
    {
        Dictionary dictionary = new Dictionary();
        dictionary.apply(INPUT_TEXT).forEach(System.out::println);
    }
}

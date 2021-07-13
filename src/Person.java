/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
public abstract class Person {
    protected String firstName;
    protected String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

}

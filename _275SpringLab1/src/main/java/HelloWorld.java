public class HelloWorld implements  Greeter{
    /**
     *  Name
     */
    private String name;

    /**
     *
     * @param name
     * Set the name
     */
    public void setName(String name) {
        this.name=name;
    }

    /**
     *
     * @return greeting message with Name
     * Get greeting message
     */
    public String getGreeting() {
        return  "Hello world from "+this.name+"!";
    }
}

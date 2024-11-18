public class Factory {

    public Shape creator(String shape)
    {
        switch(shape)
        {
            case "CIRCLE": return new Circle();
            case "SQUARE": return new Square();
            default:
                return null;
        }
    }
}

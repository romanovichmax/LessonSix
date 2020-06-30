package TaskFive;

class Square extends Figure {
    double height;
    double width;

    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return this.height * this.width;
    }
}

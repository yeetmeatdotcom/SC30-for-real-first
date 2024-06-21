class Average {
    private int count;
    private int total;

    public Average(int count, int total) {
        this.count = count;
        this.total = total;
    }

    public double getPercentage() {
        return (double) count / total * 100;
    }
}
public record RangeTwo(int start, int end) {
    
    // Canonical Constrcutor

    public RangeTwo(int start, int end) {
        if (end <= start) {
            throw new IllegalArgumentException("End cannot be lesser than start");
        }
        if (start < 0) {
            this.start = 0;
        } else {
            this.start = start;
        }

        if (end > 100) {
            this.end = 10;
        } else {
            this.end = end;
        }
    }
}

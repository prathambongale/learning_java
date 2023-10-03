public record Range(int start, int end) {
    
    // Compact Constructure
    public Range {
        if (end <= start) {
            throw new IllegalArgumentException("End can not be lesser than start");
        }
    }

}

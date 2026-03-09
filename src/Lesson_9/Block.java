package Lesson_9;

/*
https://www.codewars.com/kata/building-blocks/train/java
 */

    public class Block{
        private int width;
        private  int length;
        private  int height;
        private int volume;
        private int surface_area;

        // Constructor
        public Block (int [] data) {
            this.width = data[0];
            this.length = data[1];
            this.height = data[2];

            this.volume = width * length * height;
            this.surface_area = 2 * (width * length + width * height + length * height);
        }

        public int getWidth() {
            return width;
        }

        public int getLength() {
            return length;
        }


        public int getHeight() {
            return height;
        }

        public int getVolume() {
            return volume;
        }

        public int getSurfaceArea() {
            return surface_area;
        }
    }
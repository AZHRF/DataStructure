public class homework_4_1 {
    static class Complex {

        private double re, im;

        public Complex(double re, double im) {
            this.re = re;
            this.im = im;
        }

        // Overriding equals() to compare two Complex objects
        @Override
        public boolean equals(Object o) {

            // If the object is compared with itself then return true
            if (o == this) {
                return true;
            }

		/* Check if o is an instance of Complex or not
		"null instanceof [type]" also returns false */
            if (!(o instanceof Complex)) {
                return false;
            }

            // typecast o to Complex so that we can compare data members
            Complex c = (Complex) o;

            // Compare the data members and return accordingly
            return Double.compare(re, c.re) == 0
                    && Double.compare(im, c.im) == 0;
        }
    }



}

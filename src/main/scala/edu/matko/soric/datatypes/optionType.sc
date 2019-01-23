
// Option is a top level type which
// can be Some[Type] or None

val alienMovieReleaseYears = List(1979, 1986, 1992, 1997, 2012, 2017)

// in this case, we have Some[Int]
alienMovieReleaseYears.find(_ < 2000)

// in this case, we have None
alienMovieReleaseYears.find(_ < 1960)

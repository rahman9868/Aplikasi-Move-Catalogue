package com.chairul.moviecatalogue.utils

import com.chairul.moviecatalogue.R
import com.chairul.moviecatalogue.entity.Movie
import com.chairul.moviecatalogue.entity.TvShow

object DataDummy {

    fun generateDummyMovies(): List<Movie> {

        val movie = ArrayList<Movie>()

        movie.add(
            Movie(
                19995,
                "Avatar",
                "In the 22nd century, a paraplegic Marine is dispatched to the moon Pandora on a unique mission, but becomes torn between following orders and protecting an alien civilization.",
                "2009",
                "Sam Worthington, " +
                        "Zoe Saldana, " +
                        "Stephen Lang, " +
                        "Michelle Rodriguez, " +
                        "Sigourney Weaver",
                "Action, Adventure, Fantasy, Science Fiction",
                "Twentieth Century Fox Film Corporation",
                R.drawable.avatar,
                7.2
            )
        )

        movie.add(
            Movie(
                285,
                "Pirates of the Caribbean: At World's End",
                "Captain Barbossa, long believed to be dead, has come back to life and is headed to the edge of the Earth with Will Turner and Elizabeth Swann. But nothing is quite as it seems.",
                "2007",
                "Johnny Depp, " +
                        "Orlando Bloom, " +
                        "Keira Knightley, " +
                        "Stellan Skarsgård, " +
                        "Bill Nighy, " +
                        "Chow Yun-fat, " +
                        "Geoffrey Rush, " +
                        "Tom Hollander, " +
                        "Jack Davenport, " +
                        "Kevin R. McNally, " +
                        "Jonathan Pryce",
                "Adventure, Fantasy, Action",
                "Walt Disney Pictures",
                R.drawable.pirates_of_the_caribbean_at_worlds_end,
                6.9
            )
        )

        movie.add(
            Movie(
                206647,
                "Spectre",
                "A cryptic message from Bondâs past sends him on a trail to uncover a sinister organization. While M battles political forces to keep the secret service alive, Bond peels back the layers of deceit to reveal the terrible truth behind SPECTRE.",
                "2015",
                "Daniel Craig, " +
                        "Christoph Waltz, " +
                        "Léa Seydoux, " +
                        "Ben Whishaw, " +
                        "Naomie Harris, " +
                        "Dave Bautista, " +
                        "Andrew Scott, " +
                        "Monica Bellucci, " +
                        "Ralph Fiennes",
                "Action, Adventure ,Crime",
                "Columbia Pictures",
                R.drawable.spectre,
                6.3
            )
        )

        movie.add(
            Movie(
                49026,
                "The Dark Knight Rises",
                "Following the death of District Attorney Harvey Dent, Batman assumes responsibility for Dent's crimes to protect the late attorney's reputation and is subsequently hunted by the Gotham City Police Department. Eight years later, Batman encounters the mysterious Selina Kyle and the villainous Bane, a new terrorist leader who overwhelms Gotham's finest. The Dark Knight resurfaces to protect a city that has branded him an enemy.",
                "2012",
                "Christian Bale, " +
                        "Michael Caine, " +
                        "Gary Oldman, " +
                        "Anne Hathaway, " +
                        "Tom Hardy, " +
                        "Marion Cotillard, " +
                        "Joseph Gordon-Levitt, " +
                        "Morgan Freeman",
                "Action,Crime,Drama,Thriller",
                "Legendary Pictures",
                R.drawable.the_dark_knight_rises,
                7.6
            )
        )


        movie.add(
            Movie(
                49529,
                "John Carter",
                "John Carter is a war-weary, former military captain who's inexplicably transported to the mysterious and exotic planet of Barsoom (Mars) and reluctantly becomes embroiled in an epic conflict. It's a world on the brink of collapse, and Carter rediscovers his humanity when he realizes the survival of Barsoom and its people rests in his hands.",
                "2012",
                "Taylor Kitsch, " +
                        "Lynn Collins, " +
                        "Samantha Morton, " +
                        "Mark Strong, " +
                        "Ciarán Hinds, " +
                        "Dominic West, " +
                        "James Purefoy, " +
                        "Willem Dafoe",
                "Science, Fiction, Adventure, Action",
                "Walt Disney Pictures",
                R.drawable.john_carter,
                6.1
            )
        )

        movie.add(
            Movie(
                559,
                "Spider-Man 3",
                "The seemingly invincible Spider-Man goes up against an all-new crop of villain â€“ including the shape-shifting Sandman. While Spider-Man superpowers are altered by an alien organism, his alter ego, Peter Parker, deals with nemesis Eddie Brock and also gets caught up in a love triangle.",
                "2007",
                "Tobey Maguire, " +
                        "Kirsten Dunst, " +
                        "James Franco, " +
                        "Thomas Haden Church, " +
                        "Topher Grace, " +
                        "Bryce Dallas Howard, " +
                        "James Cromwell, " +
                        "Rosemary Harris, " +
                        "J. K. Simmons",
                "Adventure, Action, Fantasy",
                "Columbia Pictures",
                R.drawable.spider_man_3,
                5.9
            )
        )

        movie.add(
            Movie(
                38757,
                "Tangled",
                "When the kingdom's most wanted-and most charming-bandit Flynn Rider hides out in a mysterious tower, he's taken hostage by Rapunzel, a beautiful and feisty tower-bound teen with 70 feet of magical, golden hair. Flynn's curious captor, who's looking for her ticket out of the tower where she's been locked away for years, strikes a deal with the handsome thief and the unlikely duo sets off on an action-packed escapade, complete with a super-cop horse, an over-protective chameleon and a gruff gang of pub thugs.",
                "2010",
                "Mandy Moore, " +
                        "Zachary Levi, " +
                        "Donna Murphy",
                "Family, Animation",
                "Walt Disney Pictures",
                R.drawable.tangled,
                7.4
            )
        )

        movie.add(
            Movie(
                99861,
                "Avengers: Age of Ultron",
                "When Tony Stark tries to jumpstart a dormant peacekeeping program, things go awry and Earth Mightiest Heroes are put to the ultimate test as the fate of the planet hangs in the balance. As the villainous Ultron emerges, it is up to The Avengers to stop him from enacting his terrible plans, and soon uneasy alliances and unexpected action pave the way for an epic and unique global adventure.",
                "2015",
                "Robert Downey Jr, " +
                        "Chris Hemsworth, " +
                        "Mark Ruffalo, " +
                        "Chris Evans, " +
                        "Scarlett Johansson, " +
                        "Jeremy Renner, " +
                        "Don Cheadle, " +
                        "Aaron Taylor-Johnson, " +
                        "Elizabeth Olsen, " +
                        "Paul Bettany, " +
                        "Cobie Smulders, " +
                        "Anthony Mackie, " +
                        "Hayley Atwell, " +
                        "Idris Elba, " +
                        "Stellan Skarsgård, " +
                        "James Spader, " +
                        "Samuel L. Jackson",
                "Science Fiction, Adventure, Action",
                "Marvel Studios",
                R.drawable.avengers_age_of_ultron,
                7.3
            )
        )

        movie.add(
            Movie(
                767,
                "Harry Potter and the Half-Blood Prince",
                "As Harry begins his sixth year at Hogwarts, he discovers an old book marked as 'Property of the Half-Blood Prince', and begins to learn more about Lord Voldemort's dark past.",
                "2009",
                "Daniel Radcliffe, " +
                        "Rupert Grint, " +
                        "Emma Watson, " +
                        "Jim Broadbent, " +
                        "Helena Bonham Carter, " +
                        "Robbie Coltrane, " +
                        "Warwick Davis, " +
                        "Michael Gambon, " +
                        "Alan Rickman, " +
                        "Maggie Smith, " +
                        "Timothy Spall, " +
                        "David Thewlis, " +
                        "Julie Walters",
                "Family, Fantasy, Adventure",
                "Warner Bros",
                R.drawable.harry_potter_and_the_half_blood_prince,
                7.4
            )
        )

        movie.add(
            Movie(
                209112,
                "Batman v Superman: Dawn of Justice",
                "Fearing the actions of a god-like Super Hero left unchecked, Gotham City own formidable, forceful vigilante takes on Metropolis most revered, modern-day savior, while the world wrestles with what sort of hero it really needs. And with Batman and Superman at war with one another, a new threat quickly arises, putting mankind in greater danger than it ever known before.",
                "2016",
                "Ben Affleck, " +
                        "Henry Cavill, " +
                        "Jesse Eisenberg, " +
                        "Gal Gadot, " +
                        "Laurence Fishburne, " +
                        "Amy Adams, " +
                        "Jeremy Irons, " +
                        "Holly Hunter, " +
                        "Diane Lane",
                "Fantasy, Adventure, Action",
                "DC Comics",
                R.drawable.batman_v_superman_dawn_of_justice,
                5.7
            )
        )
        return movie
    }

    fun generateDummyTvShow(): List<TvShow> {

        val tvshow = ArrayList<TvShow>()

        tvshow.add(
            TvShow(
                70234439,
                "Transformers Prime",
                "Peter Cullen, Sumalee Montano, Frank Welker, Jeffrey Combs, Kevin Michael Richardson, Tania Gunadi, Josh Keaton, Steve Blum, Andy Pessoa, Ernie Hudson, Daran Norris, Will Friedle",
                "With the help of three human allies, the Autobots once again protect Earth from the onslaught of the Decepticons and their leader, Megatron.",
                "Action, " +"Adventure, " +"Science fiction, " +"Drama, " +"Superhero, " +"Thriller",
                "2013",
                "1 Season",
                R.drawable.transformers_prime


            )
        )

        tvshow.add(
            TvShow(
                80058654,
                "Transformers: Robots in Disguise",
                "Will Friedle, Darren Criss, Constance Zimmer, Khary Payton, Mitchell Whitfield, Stuart Allan, Ted McGinley, Peter Cullen",
                "When a prison ship crash unleashes hundreds of Decepticons on Earth, Bumblebee leads a new Autobot force to protect humankind.",
                "Action, " +"Adventure, " +"Science fiction, " +"Drama, " +"Superhero, " +"Thriller",
                "2016",
                "1 Season",
                R.drawable.transformers_robots_in_disguise

            )
        )

        tvshow.add(
            TvShow(
                80163890,
                "Apaches",
                "Alberto Ammann, Eloy AzorÃ­n, VerÃ³nica Echegui, LucÃ­a JimÃ©nez, Claudia Traisac",
                "A young journalist is forced into a life of crime to save his father and family in this series based on the novel by Miguel SÃ¡ez Carral.",
                "Drama, Thriller",
                "2016",
                "1 Season",
                R.drawable.apaches

            )
        )

        tvshow.add(
            TvShow(
                80116921,
                "We Bare Bears",
                "Eric Edelstein, Demetri Martin, Bobby Moynihan",
                "Grizzly, Panda and Ice Bear are three adopted bear brothers struggling against their animal instincts to fit into the civilized, modern human world.",
                "Cartoon, Comedy, Animation, Animated Series",
                "2017",
                "1 Season",
                R.drawable.we_bare_bears


            )
        )

        tvshow.add(
            TvShow(
                80244601,
                "Castle of Stars",
                "Chaiyapol Pupart, Jintanutda Lummakanon, Worrawech Danuwong, Ornjira Lamwilai, Yong Armchair, Keerati Mahapreukpong, Akarat Nimitchai, Kornpassorn Duaysianklao, Nattapong Chartpong",
                "As four couples with different lifestyles go through the ebbs and flows of joy and sorrow, each must learn how to live a good life.",
                "Drama, Romance",
                "2015",
                "1 Season",
                R.drawable.castle_of_stars

            )
        )

        tvshow.add(
            TvShow(
                80113641,
                "Frequency",
                "Peyton List, Riley Smith, Mekhi Phifer, Devin Kelley, Lenny Jacobson, Daniel Bonjour, Anthony Ruivivar",
                "A detective seizes a precious opportunity to change the past when she finds she can communicate with her deceased, estranged father via a time warp.",
                "Drama, Mystery, Science Fiction",
                "2016",
                "1 Season",
                R.drawable.frequency

            )
        )

        tvshow.add(
            TvShow(
                81054495,
                "Mo Gilligan: Momentum",
                "Mo Gilligan",
                "Comedian Mo Gilligan blends smooth moves and sharp humor as he riffs on humble beginnings, family dynamics and the complex art of dancing in the club.",
                "Comedy",
                "2019",
                "64 min",
                R.drawable.mo_gilligan_momentum

            )
        )

        tvshow.add(
            TvShow(
                80996949,
                "Adam Ruins Everything",
                "Adam Conover, Adam Lustick, Emily Axford",
                "Education can be fun â€“ and funny. Comedian Adam Conover bursts misconceptions, deconstructs topics and leaves with positive takeaways.",
                "Comedy, Education",
                "2018",
                "1 Season",
                R.drawable.adam_ruins_everything

            )
        )

        tvshow.add(
            TvShow(
                80239337,
                "Ben 10",
                "Tara Strong, Montse Hernandez, David Kaye, Roger Craig Smith, Todd Haberkorn, Dwight Schultz, Daryl Sabara",
                "Ben can transform into ten types of aliens. He'll try 'em all while adventuring across the country with his cousin Gwen and Grandpa Max.",
                "Animation, Action Fiction, Adventure, Family, Science Fiction, Comdey, Children",
                "2016",
                "1 Season",
                R.drawable.ben_10

            )
        )

        tvshow.add(
            TvShow(
                80180449,
                "Satu Hari",
                "Sara Ali, Remy Ishak, Rita Rudaini, Mirza Salihovic, Hafizul Kamal, Miller Khan",
                "A man haunted by his wife's affair moves to Sarajevo and starts to love again, until fate forces him to choose between his new life and old loyalty.",
                "Drama",
                "2014",
                "1 Season",
                R.drawable.satu_hari

            )
        )

        return tvshow
    }
}
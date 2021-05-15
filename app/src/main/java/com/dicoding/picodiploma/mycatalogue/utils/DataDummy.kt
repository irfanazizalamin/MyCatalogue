package com.dicoding.picodiploma.mycatalogue.utils

import com.dicoding.picodiploma.mycatalogue.R
import com.dicoding.picodiploma.mycatalogue.data.VideoContent

object DataDummy {

    fun generateDummyTvShows() : List<VideoContent> {
        val tvShows = ArrayList<VideoContent>()

        tvShows.add(VideoContent(
            "tv-1",
            "Arrow",
            "10/10/2012",
            66.0,
            "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "https://youtu.be/hTv13EjlLNg",
            R.drawable.poster_arrow
        ))

        tvShows.add(VideoContent(
            "tv-2",
            "Doom Patrol",
            "02/15/2019",
            76.0,
            "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "https://youtu.be/6wtGnnLfTqA",
            R.drawable.poster_doom_patrol
        ))

        tvShows.add(VideoContent(
            "tv-3",
            "Dragon Ball",
            "07/01/2018",
            82.0,
            "The series begins twelve years after Goku is seen leaving on Shenron not at the end of Dragon Ball GT, and diverges entirely into its own plot from there, on an alternate timeline from the one which shows Goku Jr. fighting Vegeta Jr. at the World Martial Arts Tournament. In this series, Majuub has reached new levels of power, and has honed the techniques taught to him by Goku. We also see Gotenks finally mature, and Vegeta more powerful than ever.Each character will bring forth their own set of capabilities and purpose, winning fights and being relevant, in order to create an environment that emphasizes teamwork as well as individual worth for each character. In this series, the main set of villains are Saiyans, with abilities highly similar to the Saiyans that we are familiar with. These new Saiyans are more powerful than any threat the Z Fighters have ever faced, but after twelve years of intensive training, our heroes will not be easily defeated .",
            "https://youtu.be/Yj0l7iGKh8g",
            R.drawable.poster_dragon_ball
        ))

        tvShows.add(VideoContent(
            "tv-4",
            "Flash",
            "07/01/2014",
            77.0,
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
            "https://youtu.be/Yj0l7iGKh8g",
            R.drawable.poster_flash
        ))

        tvShows.add(VideoContent(
            "tv-5",
            "God",
            "02/01/2016",
            71.0,
            "An up-and-coming journalist finds his world and faith increasingly challenged when he's granted the interview of a lifetime – with someone who claims to be God.",
            "https://youtu.be/bCE39OeR4Js",
            R.drawable.poster_god
        ))

        tvShows.add(VideoContent(
            "tv-6",
            "Gotham",
            "02/03/2015",
            81.0,
            "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
            "https://youtu.be/bCE39OeR4Js",
            R.drawable.poster_gotham
        ))

        tvShows.add(VideoContent(
            "tv-7",
            "Iron",
            "02/02/2016",
            79.0,
            "When Tony Stark's world is torn apart by a formidable terrorist called the Mandarin, he starts an odyssey of rebuilding and retribution.",
            "https://youtu.be/f_h95mEd4TI",
            R.drawable.poster_iron_fist
        ))

        tvShows.add(VideoContent(
            "tv-8",
            "Naruto Shippuden",
            "02/02/2007",
            71.0,
            "Demons that once almost destroyed the world, are revived by someone. To prevent the world from being destroyed, the demon has to be sealed and the only one who can do it is the shrine maiden Shion from the country of demons, who has two powers; one is sealing demons and the other is predicting the deaths of humans. This time Naruto's mission is to guard Shion, but she predicts Naruto's death. The only way to escape it, is to get away from Shion, which would leave her unguarded, then the demon, whose only goal is to kill Shion will do so, thus meaning the end of the world. Naruto decides to challenge this \"prediction of death.\"",
            "https://youtu.be/f_h95mEd4TI",
            R.drawable.poster_naruto_shipudden
        ))

        tvShows.add(VideoContent(
            "tv-9",
            "Ncis",
            "10/02/2003",
            74.0,
            "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
            "https://youtu.be/fRfpzhmQGFY",
            R.drawable.poster_ncis
        ))

        tvShows.add(VideoContent(
            "tv-10",
            "Supernatural",
            "10/02/2005",
            82.0,
            "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
            "https://youtu.be/yy96yJjkvjo",
            R.drawable.poster_supernatural
        ))

        return tvShows
    }

    fun generateDummyMovies() : List<VideoContent> {
        val movies = ArrayList<VideoContent>()

        movies.add(VideoContent(
            "m-1",
            "Aquaman",
            "12/21/2018",
            69.0,
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "https://youtu.be/WDkg3h8PCVU",
            R.drawable.poster_aquaman
        ))

        movies.add(VideoContent(
            "m-2",
            "Bohemian",
            "11/02/2018",
            80.0,
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "https://youtu.be/HlRd9Zy25zo",
            R.drawable.poster_bohemian
        ))

        movies.add(VideoContent(
            "m-3",
            "Cold Pursuit",
            "11/02/2012",
            57.0,
            "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
            "https://youtu.be/0phuNQQ_gHI",
            R.drawable.poster_cold_persuit
        ))

        movies.add(VideoContent(
            "m-4",
            "Crimes",
            "11/02/2018",
            69.0,
            "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
            "https://youtu.be/5sEaYB4rLFQ",
            R.drawable.poster_crimes
        ))

        movies.add(VideoContent(
            "m-5",
            "Glass",
            "12/04/2019",
            67.0,
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            "https://youtu.be/95ghQs5AmNk",
            R.drawable.poster_glass
        ))

        movies.add(VideoContent(
            "m-6",
            "Infinity War",
            "12/04/2018",
            83.0,
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "https://youtu.be/sAOzrChqmd0",
            R.drawable.poster_infinity_war
        ))

        movies.add(VideoContent(
            "m-7",
            "Overlord",
            "10/01/2018",
            67.0,
            "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
            "https://youtu.be/USPd0vX2sdc",
            R.drawable.poster_overlord
        ))

        movies.add(VideoContent(
            "m-8",
            "Ralph",
            "10/01/2012",
            71.0,
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
            "https://youtu.be/USPd0vX2sdc",
            R.drawable.poster_ralph
        ))

        movies.add(VideoContent(
            "m-9",
            "Spiderman",
            "10/01/2017",
            71.0,
            "Following the events of Captain America: Civil War, Peter Parker, with the help of his mentor Tony Stark, tries to balance his life as an ordinary high school student in Queens, New York City, with fighting crime as his superhero alter ego Spider-Man as a new threat, the Vulture, emerges.",
            "https://youtu.be/rk-dF1lIbIg",
            R.drawable.poster_spiderman
        ))

        movies.add(VideoContent(
            "m-10",
            "T34",
            "12/27/2018",
            69.0,
            "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
            "https://youtu.be/D1UDvi5xL9w",
            R.drawable.poster_t34
        ))

        return movies
    }
}
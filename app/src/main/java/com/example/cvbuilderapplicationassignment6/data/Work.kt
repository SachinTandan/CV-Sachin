package com.example.cvbuilderapplicationassignment6.data

data class Work(
    val companyName: String,
    val fromDate: String,
    val toDate: String,
    val location: String,
    val logo: String,
    val roles: String
) {
    companion object {
        fun getWorkList() : MutableList<Work> {
            return mutableListOf(
                Work(
                    "Creospan Inc",
                    "Sep 2022",
                    "current",
                    "Chicago, IL",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFYTYGC0_a0dKUgqb6enqHrzs8xO6ZDOBtljcVNgL2Mg&s",
                    "FUllSTACK ENGINEER"
                ),
                Work(
                    "TechnoMax Nepal",
                    "May 2017",
                    "Jun 2021",
                    "Kathmandu, Nepal",
                    "https://clutchco-static.s3.amazonaws.com/s3fs-public/logos/technomax_logo.png?VersionId=nkHlOyhujouEveLww7J2Q4k1GJzRMb__",
                    "FULLSTACK ENGINEER"
                ),

            )
        }
    }
}

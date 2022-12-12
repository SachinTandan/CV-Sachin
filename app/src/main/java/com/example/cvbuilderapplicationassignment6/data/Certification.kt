package com.example.cvbuilderapplicationassignment6.data

data class Certification(
    val logo: String,
    val name: String
) {
    companion object {
        fun getCertificateList(): MutableList<Certification> {
            return mutableListOf(
                Certification(
                    "https://w7.pngwing.com/pngs/947/563/png-transparent-oracle-certification-program-oracle-certified-professional-java-se-programmer-java-platform-standard-edition-oracle-database-others-angle-text-logo.png",
                    "Oracle Certified Professional"
                ),
                Certification(
                    "https://d1.awsstatic.com/training-and-certification/certification-badges/AWS-Certified-Solutions-Architect-Associate_badge.3419559c682629072f1eb968d59dea0741772c0f.png",
                    "AWS Solution Architect"
                )
            )
        }
    }
}

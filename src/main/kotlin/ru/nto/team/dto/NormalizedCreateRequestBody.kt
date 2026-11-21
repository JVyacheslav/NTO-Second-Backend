package ru.nto.team.dto

data class NormalizedCreateRequestBody(val fullName: String,
                                       val phone: String,
                                       val organization: String,
                                       val purpose: String,
                                       val validFrom: String,
                                       val validTo: String)
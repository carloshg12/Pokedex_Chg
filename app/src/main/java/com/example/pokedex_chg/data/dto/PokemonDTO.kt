package com.example.pokedex_chg.data.dto
import com.google.gson.annotations.SerializedName

data class PokemonDTO(
    @SerializedName("id")
    val id: String,

    @SerializedName("sprites")
    val sprites: Sprites,

    @SerializedName("name")
    val name: String,

    @SerializedName("types")
    val types: List<Types>,

    @SerializedName("weight")
    val weight: Float,

    @SerializedName("base_experience")
    val experience: Float,

    @SerializedName("height")
    val height: Float,

    @SerializedName("stats")
    val stats: List<Stat>
)

data class Sprites(
    @SerializedName("other")
    val other: Other
)

data class Other(
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtwork
)

data class OfficialArtwork(
    @SerializedName("front_default")
    val frontDefault: String
)

data class Types(
    @SerializedName("slot")
    val slot: Int,
    @SerializedName("type")
    val type: TypeInfo
)

data class TypeInfo(
    @SerializedName("name")
    val name: String
)

data class Stat(
    @SerializedName("base_stat")
    val base_stat: Int,
    @SerializedName("stat")
    val stat: StatInfo
)

data class StatInfo(
    @SerializedName("name")
    val name: String
)


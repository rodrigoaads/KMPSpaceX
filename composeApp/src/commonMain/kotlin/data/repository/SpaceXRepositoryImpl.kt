package data.repository

import data.Service
import model.LaunchModel

interface SpaceXRepository {
    suspend fun getLaunches(): List<LaunchModel>
}

class SpaceXRepositoryImpl(
    private val service: Service = Service()
): SpaceXRepository {
    override suspend fun getLaunches(): List<LaunchModel> {
        return service.getLaunches().map { it.toLaunchModel() }.asReversed()
    }
}
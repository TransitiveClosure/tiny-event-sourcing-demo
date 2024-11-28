package ru.quipy.projections.repository

import org.springframework.data.mongodb.repository.MongoRepository
import ru.quipy.projections.entity.ProjectProjection
import java.util.*

interface TaskInfoRepository : MongoRepository<ProjectProjection, UUID>
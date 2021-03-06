package com.kennycason.ml.model

import com.kennycason.ml.model.time.Range

/**
 * Created by kenny on 11/7/16.
 *
 */
data class AppointmentRequest(val customer: Person,
                              val employee: Employee?,
                              val service: Service,
                              val time: Range?)
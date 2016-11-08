package com.kennycason.ml.algorithm.montecarlo.cost

import com.kennycason.ml.algorithm.montecarlo.model.Arrangement
import com.kennycason.ml.model.Office

/**
 * Created by kenny on 11/7/16.
 *
 * this utilization function will calculate the balance of:
 * 1. avg of employee time used. 1.0 means every one's time is 100% utilized, 0.0 means zero utilization.
 *      1/n ∑ percent_of_employee_time_utilized, where n = the number of people
 *
 * 2. avg of room resources used. 1.0 means every room is 100% utilized, 0.0 means zero utilization.
 *      1/n ∑ percent_of_room_utilized, where n = the number of rooms
 *      this is calculated
 *
 * Note: Assumes all arrangements are valid
 */
class ArrangementUtilizationFunction(val office: Office,
                                     val roomBalanceWeight: Double = 0.50,
                                     val employeeWeight: Double = 0.50)
{
    fun evaluate(arrangement: Arrangement) {

    }

    private fun employeeBalance(arrangement: Arrangement) {
        val totalEmployees = office.employees.size()
       // arrangement.e

    }
}

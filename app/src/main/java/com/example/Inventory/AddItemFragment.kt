package com.example.Inventory

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.Inventory.Remote.RestApiService
import com.example.Inventory.databinding.FragmentAddItemBinding
import com.example.Inventory.model.ItemModel

class AddItemFragment : Fragment() {

    private lateinit var binding : FragmentAddItemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddItemBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSave.setOnClickListener { v->
            if(validateFields()){
                var item = ItemModel(null,"CITY CENTER","TEST1",32)
                RestApiService().addItem(item){
                    if(it != null)
                    {
                        Log.i("AddItem","Item Added")
                    }
                }

            }
        }
    }

    private fun validateFields(): Boolean {

        var itemName = binding.etItemName.text.toString()
        var quantity = binding.etQuantity.text

        //var itemNameValidation = validateItem(itemName)
        //var quantityValidation = validateQuantity(quantity)

        return true

    }

    /*private fun validateQuantity(quantity: Editable?): Any {

    }*/

    /*private fun validateItem(itemName: String): Any {

    }*/


}
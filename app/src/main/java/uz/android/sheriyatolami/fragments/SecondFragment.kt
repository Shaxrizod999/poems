package uz.android.sheriyatolami.fragments

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import uz.android.sheriyatolami.R
import uz.android.sheriyatolami.adapter.RecyclerAdapter
import uz.android.sheriyatolami.databinding.FragmentFourthBinding
import uz.android.sheriyatolami.databinding.FragmentSecondBinding
import uz.android.sheriyatolami.model.Sher


class SecondFragment : Fragment() {


    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.back1.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.rv.adapter = RecyclerAdapter(initList()) {
            val dialog = AlertDialog.Builder(requireContext()).create()
            val dialogView = layoutInflater.inflate(R.layout.dialog_view, binding.root, false)
            var ss = dialogView.findViewById<TextView>(R.id.desc)
            ss.text = it.sher
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setView(dialogView)
            dialog.show()
        }
        return binding.root
    }

    private fun initList(): ArrayList<Sher> {

        var list: ArrayList<Sher> = ArrayList()

        for (i in 1..4) {
            list.add(
                    Sher(
                            "Sevmaganga suykalma", "Sevmaganga suykalma\n\nDavosi yo‘q dardimning\n" +
                            "Darmonlari ko‘p ekan\n" +
                            "Sevgida yo‘q qadrimning\n" +
                            "Qadrdoni to‘p ekan.\n" +
                            "\n" +
                            "Men bilgan ul parining\n" +
                            "Dilida jon yo‘q ekan\n" +
                            "Izhor etgan sevgimning\n" +
                            "Tinglovchisi yo‘q ekan \n" +
                            "\n" +
                            "Endi bildim ey hayot\n" +
                            "Sevmaganga suykalma.\n" +
                            "Bu shiorni olgin yod\n" +
                            "Orzularga burkanma."
                    )
            )
            list.add(Sher("Sevgim qadri", "Sevgim qadri\n\nQanchalar sog‘insam shunchalar yiroq\n" +
                    "Qaylarda qolyapti mehrimning qadri\n" +
                    "Men jonsiz ketyapman olisda qirg‘oq\n" +
                    "Har soat ortyapti yuragim dardi.\n" +
                    "\n" +
                    "O‘zimda xatomi? Bunchalar sog‘inch\n" +
                    "Shunchalik o‘zimni yolg‘iz sezyapman\n" +
                    "Endi bo‘lolmasmi hech kim ham ovunch? \n" +
                    "Yuragim sen nega qalbim ezyapsan.\n"))
        }
            return list
        }
    }




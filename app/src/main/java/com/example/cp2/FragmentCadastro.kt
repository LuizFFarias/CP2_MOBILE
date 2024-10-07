import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.example.cp2.R

class FragmentCadastro : Fragment() {

    private lateinit var inputNome: EditText
    private lateinit var inputEmail: EditText
    private lateinit var spinnerOpcoes: Spinner
    private lateinit var buttonCadastrar: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate o layout do fragmento
        val view = inflater.inflate(R.layout.fragment_cadastro, container, false)

        // Inicializa os inputs
        inputNome = view.findViewById(R.id.inputNome)
        inputEmail = view.findViewById(R.id.inputEmail)
        spinnerOpcoes = view.findViewById(R.id.spinnerOpcoes)
        buttonCadastrar = view.findViewById(R.id.buttonCadastrar)

        // Definir as opções do Spinner
        val opcoes = arrayOf("Português", "Inglês")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, opcoes)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerOpcoes.adapter = adapter

        return view
    }
}

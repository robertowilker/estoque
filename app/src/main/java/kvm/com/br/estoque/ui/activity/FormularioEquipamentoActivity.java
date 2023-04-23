package kvm.com.br.estoque.ui.activity;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;

import kvm.com.br.estoque.R;
import kvm.com.br.estoque.dao.PredioDAO;
import kvm.com.br.estoque.model.Equipamento;
import kvm.com.br.estoque.model.Estoque;
import kvm.com.br.estoque.model.Predio;
import kvm.com.br.estoque.model.StatusDoEquipamento;
import kvm.com.br.estoque.ui.ConstantesActivity;

public class FormularioEquipamentoActivity extends AppCompatActivity implements ConstantesActivity {

    private EditText nomeEditText;
    private EditText marcaEditText;
    private EditText modeloEditText;
    private Spinner statusSpinner;
    private Spinner predioSpinner;
    private EditText qrCodeEditText;
    private EditText salaEditText;
    private EditText estoquePrateleiraEditText;
    private EditText estoqueCaixaEditText;
    private EditText observacaoEditText;
    private EditText numeroDeSerieEditText;
    private Equipamento equipamento;
    private PredioDAO predioDAO = new PredioDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(TITULO_APPBAR);
        setContentView(R.layout.activity_formulario_equipamento);

        vinculaCamposFormularioEquipamento();

    }

    private void vinculaCamposFormularioEquipamento() {
        nomeEditText = findViewById(R.id.activity_formulario_equipamento_nome);
        marcaEditText = findViewById(R.id.activity_formulario_equipamento_marca);
        modeloEditText = findViewById(R.id.activity_formulario_equipamento_modelo);
        statusSpinner = findViewById(R.id.activity_formulario_equipamento_spinner_status);
        predioSpinner = findViewById(R.id.activity_formulario_equipamento_spinner_predio);
        qrCodeEditText = findViewById(R.id.activity_formulario_equipamento_qrCode);
        salaEditText = findViewById(R.id.activity_formulario_equipamento_sala);
        estoquePrateleiraEditText = findViewById(R.id.activity_formulario_equipamento_prateleira);
        estoqueCaixaEditText = findViewById(R.id.activity_formulario_equipamento_caixa);
        observacaoEditText = findViewById(R.id.activity_formulario_equipamento_observacao);
        numeroDeSerieEditText = findViewById(R.id.activity_formulario_equipamento_numerodeserie);

        String nome = nomeEditText.getText().toString();
        String marca = marcaEditText.getText().toString();
        String modelo = modeloEditText.getText().toString();
//        statusSpinner.get
//        predioSpinner.get
        String qrCode = qrCodeEditText.getText().toString();
        String sala = salaEditText.getText().toString();
        String estoquePrateleira = estoquePrateleiraEditText.getText().toString();
        String estoqueCaixa = estoqueCaixaEditText.getText().toString();
        String observacao = observacaoEditText.getText().toString();
        String numeroDeSerie = numeroDeSerieEditText.getText().toString();

        Predio predioSelecionado = predioDAO.getById(0);
        equipamento = new Equipamento(nome,
                marca,
                modelo,
                new StatusDoEquipamento(),
                qrCode,
                predioSelecionado,
                "101",
                new Estoque(0L, estoquePrateleira, estoqueCaixa),
                ".",
                "ASCNRWOVNEROVNE");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_formulario_equipamento_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.activity_formulario_equipamento_menu_salvar){

        }
        return super.onOptionsItemSelected(item);
    }
}
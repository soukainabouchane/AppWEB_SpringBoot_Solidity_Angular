package com.arg.spring.jwt.mongodb.models;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple5;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class MyContract_sol_MyContract extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50610dc5806100206000396000f3fe608060405234801561001057600080fd5b506004361061007d5760003560e01c806341976e091161005b57806341976e09146103345780638c3b88941461038c578063d4e2451a14610528578063da70741a146105965761007d565b80631d2559b91461008257806321e1083f1461013f578063229666271461019e575b600080fd5b6100c46004803603602081101561009857600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff1690602001909291905050506105b4565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156101045780820151818401526020810190506100e9565b50505050905090810190601f1680156101315780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b610147610697565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b8381101561018a57808201518184015260208101905061016f565b505050509050019250505060405180910390f35b6101e0600480360360208110156101b457600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610725565b604051808673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018060200184815260200180602001838103835286818151815260200191508051906020019080838360005b8381101561028e578082015181840152602081019050610273565b50505050905090810190601f1680156102bb5780820380516001836020036101000a031916815260200191505b50838103825284818151815260200191508051906020019080838360005b838110156102f45780820151818401526020810190506102d9565b50505050905090810190601f1680156103215780820380516001836020036101000a031916815260200191505b5097505050505050505060405180910390f35b6103766004803603602081101561034a57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610a01565b6040518082815260200191505060405180910390f35b610526600480360360a08110156103a257600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803590602001906401000000008111156103ff57600080fd5b82018360208201111561041157600080fd5b8035906020019184600183028401116401000000008311171561043357600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f82011690508083019250505050505050919291929080359060200190929190803590602001906401000000008111156104a057600080fd5b8201836020820111156104b257600080fd5b803590602001918460018302840111640100000000831117156104d457600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610a4c565b005b6105546004803603602081101561053e57600080fd5b8101908080359060200190929190505050610cab565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b61059e610ce7565b6040518082815260200191505060405180910390f35b60606000808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000018054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561068b5780601f106106605761010080835404028352916020019161068b565b820191906000526020600020905b81548152906001019060200180831161066e57829003601f168201915b50505050509050919050565b6060600180548060200260200160405190810160405280929190818152602001828054801561071b57602002820191906000526020600020905b8160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190600101908083116106d1575b5050505050905090565b6000806060600060606000808773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff166000808873ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060030160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff166000808973ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000016000808a73ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600101546000808b73ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600401828054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561094b5780601f106109205761010080835404028352916020019161094b565b820191906000526020600020905b81548152906001019060200180831161092e57829003601f168201915b50505050509250808054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156109e75780601f106109bc576101008083540402835291602001916109e7565b820191906000526020600020905b8154815290600101906020018083116109ca57829003601f168201915b505050505090509450945094509450945091939590929450565b60008060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600101549050919050565b816000808673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060010181905550826000808673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000019080519060200190610ae7929190610cf4565b50836000808673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060030160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550846000808673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550806000808673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206004019080519060200190610c3d929190610cf4565b5060018490806001815401808255809150509060018203906000526020600020016000909192909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550505050505050565b60018181548110610cb857fe5b906000526020600020016000915054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6000600180549050905090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10610d3557805160ff1916838001178555610d63565b82800160010185558215610d63579182015b82811115610d62578251825591602001919060010190610d47565b5b509050610d709190610d74565b5090565b610d9691905b80821115610d92576000816000905550600101610d7a565b5090565b9056fea165627a7a7230582092f1293223fae2664db2a22bb8a8666acf5784ed2aefcdcd0593dc3ccc8d05de0029";

    public static final String FUNC_GETTITRE = "getTitre";

    public static final String FUNC_GETBIENIMOBILERS = "getBienImobilers";

    public static final String FUNC_GETBIENIMOBILER = "getBienImobiler";

    public static final String FUNC_GETPRICE = "getPrice";

    public static final String FUNC_SETBIENIMOBILER = "setBienImobiler";

    public static final String FUNC_ALLBIENIMOBILIERS = "AllBienImobiliers";

    public static final String FUNC_COUNTBIENIMOBILERS = "countBienImobilers";

    @Deprecated
    protected MyContract_sol_MyContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

  

    @Deprecated
    protected MyContract_sol_MyContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected MyContract_sol_MyContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> getTitre(String _address) {
        final Function function = new Function(FUNC_GETTITRE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address( _address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }
  
    public RemoteCall<List> getBienImobilers() {
        final Function function = new Function(FUNC_GETBIENIMOBILERS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }
  
    public  RemoteCall<List> getBienImobiler(String _address) {
        final Function function = new Function(FUNC_GETBIENIMOBILER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<List>(
                new Callable<List>(){
                    @Override
                    public java.util.List call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                       
                        		return convertToNative(results);
                    }
        });
    }

    public  RemoteCall<BigInteger> getPrice(String _address) {
        final Function function = new Function(FUNC_GETPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address( _address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setBienImobiler(String _vendeur, String _acheteur, String _titre, BigInteger _price, String _date) {
        final Function function = new Function(
                FUNC_SETBIENIMOBILER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_vendeur), 
                new org.web3j.abi.datatypes.Address( _acheteur), 
                new org.web3j.abi.datatypes.Utf8String(_titre), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.Utf8String(_date)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }
   

    public RemoteCall<String> AllBienImobiliers(BigInteger param0) {
        final Function function = new Function(FUNC_ALLBIENIMOBILIERS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> countBienImobilers() {
        final Function function = new Function(FUNC_COUNTBIENIMOBILERS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return  executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static MyContract_sol_MyContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new MyContract_sol_MyContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static MyContract_sol_MyContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new MyContract_sol_MyContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

  

    public static MyContract_sol_MyContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new MyContract_sol_MyContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

  

    @Deprecated
    public static RemoteCall<MyContract_sol_MyContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(MyContract_sol_MyContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }


    @Deprecated
    public static RemoteCall<MyContract_sol_MyContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(MyContract_sol_MyContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}

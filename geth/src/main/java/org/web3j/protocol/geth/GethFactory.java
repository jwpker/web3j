package org.web3j.protocol.geth;

import org.web3j.protocol.Web3jService;

public class GethFactory {

    public static Geth build(Web3jService web3jService) {
        return new JsonRpc2_0Geth(web3jService);
    }

}

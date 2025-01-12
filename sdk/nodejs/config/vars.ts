// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("akamai");

export declare const cacheEnabled: boolean | undefined;
Object.defineProperty(exports, "cacheEnabled", {
    get() {
        return __config.getObject<boolean>("cacheEnabled");
    },
    enumerable: true,
});

export declare const config: outputs.config.Config | undefined;
Object.defineProperty(exports, "config", {
    get() {
        return __config.getObject<outputs.config.Config>("config");
    },
    enumerable: true,
});

/**
 * The section of the edgerc file to use for configuration
 */
export declare const configSection: string | undefined;
Object.defineProperty(exports, "configSection", {
    get() {
        return __config.get("configSection");
    },
    enumerable: true,
});

export declare const edgerc: string | undefined;
Object.defineProperty(exports, "edgerc", {
    get() {
        return __config.get("edgerc");
    },
    enumerable: true,
});

/**
 * The maximum number of API requests to be made per second (0 for no limit)
 */
export declare const requestLimit: number | undefined;
Object.defineProperty(exports, "requestLimit", {
    get() {
        return __config.getObject<number>("requestLimit");
    },
    enumerable: true,
});


// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getBotmanJavascriptInjection(args: GetBotmanJavascriptInjectionArgs, opts?: pulumi.InvokeOptions): Promise<GetBotmanJavascriptInjectionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getBotmanJavascriptInjection:getBotmanJavascriptInjection", {
        "configId": args.configId,
        "securityPolicyId": args.securityPolicyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBotmanJavascriptInjection.
 */
export interface GetBotmanJavascriptInjectionArgs {
    configId: number;
    securityPolicyId: string;
}

/**
 * A collection of values returned by getBotmanJavascriptInjection.
 */
export interface GetBotmanJavascriptInjectionResult {
    readonly configId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly securityPolicyId: string;
}
export function getBotmanJavascriptInjectionOutput(args: GetBotmanJavascriptInjectionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBotmanJavascriptInjectionResult> {
    return pulumi.output(args).apply((a: any) => getBotmanJavascriptInjection(a, opts))
}

/**
 * A collection of arguments for invoking getBotmanJavascriptInjection.
 */
export interface GetBotmanJavascriptInjectionOutputArgs {
    configId: pulumi.Input<number>;
    securityPolicyId: pulumi.Input<string>;
}
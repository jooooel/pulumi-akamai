// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getBotmanAkamaiBotCategoryAction(args: GetBotmanAkamaiBotCategoryActionArgs, opts?: pulumi.InvokeOptions): Promise<GetBotmanAkamaiBotCategoryActionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getBotmanAkamaiBotCategoryAction:getBotmanAkamaiBotCategoryAction", {
        "categoryId": args.categoryId,
        "configId": args.configId,
        "securityPolicyId": args.securityPolicyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBotmanAkamaiBotCategoryAction.
 */
export interface GetBotmanAkamaiBotCategoryActionArgs {
    categoryId?: string;
    configId: number;
    securityPolicyId: string;
}

/**
 * A collection of values returned by getBotmanAkamaiBotCategoryAction.
 */
export interface GetBotmanAkamaiBotCategoryActionResult {
    readonly categoryId?: string;
    readonly configId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly securityPolicyId: string;
}
export function getBotmanAkamaiBotCategoryActionOutput(args: GetBotmanAkamaiBotCategoryActionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBotmanAkamaiBotCategoryActionResult> {
    return pulumi.output(args).apply((a: any) => getBotmanAkamaiBotCategoryAction(a, opts))
}

/**
 * A collection of arguments for invoking getBotmanAkamaiBotCategoryAction.
 */
export interface GetBotmanAkamaiBotCategoryActionOutputArgs {
    categoryId?: pulumi.Input<string>;
    configId: pulumi.Input<number>;
    securityPolicyId: pulumi.Input<string>;
}
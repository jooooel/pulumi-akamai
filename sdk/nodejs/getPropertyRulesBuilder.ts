// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getPropertyRulesBuilder(args?: GetPropertyRulesBuilderArgs, opts?: pulumi.InvokeOptions): Promise<GetPropertyRulesBuilderResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getPropertyRulesBuilder:getPropertyRulesBuilder", {
        "rulesV20230105": args.rulesV20230105,
    }, opts);
}

/**
 * A collection of arguments for invoking getPropertyRulesBuilder.
 */
export interface GetPropertyRulesBuilderArgs {
    rulesV20230105?: inputs.GetPropertyRulesBuilderRulesV20230105;
}

/**
 * A collection of values returned by getPropertyRulesBuilder.
 */
export interface GetPropertyRulesBuilderResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly ruleFormat: string;
    readonly rulesV20230105?: outputs.GetPropertyRulesBuilderRulesV20230105;
}
export function getPropertyRulesBuilderOutput(args?: GetPropertyRulesBuilderOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPropertyRulesBuilderResult> {
    return pulumi.output(args).apply((a: any) => getPropertyRulesBuilder(a, opts))
}

/**
 * A collection of arguments for invoking getPropertyRulesBuilder.
 */
export interface GetPropertyRulesBuilderOutputArgs {
    rulesV20230105?: pulumi.Input<inputs.GetPropertyRulesBuilderRulesV20230105Args>;
}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getImagingPolicyImage(args: GetImagingPolicyImageArgs, opts?: pulumi.InvokeOptions): Promise<GetImagingPolicyImageResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getImagingPolicyImage:getImagingPolicyImage", {
        "policy": args.policy,
    }, opts);
}

/**
 * A collection of arguments for invoking getImagingPolicyImage.
 */
export interface GetImagingPolicyImageArgs {
    policy: inputs.GetImagingPolicyImagePolicy;
}

/**
 * A collection of values returned by getImagingPolicyImage.
 */
export interface GetImagingPolicyImageResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly policy: outputs.GetImagingPolicyImagePolicy;
}
export function getImagingPolicyImageOutput(args: GetImagingPolicyImageOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetImagingPolicyImageResult> {
    return pulumi.output(args).apply((a: any) => getImagingPolicyImage(a, opts))
}

/**
 * A collection of arguments for invoking getImagingPolicyImage.
 */
export interface GetImagingPolicyImageOutputArgs {
    policy: pulumi.Input<inputs.GetImagingPolicyImagePolicyArgs>;
}
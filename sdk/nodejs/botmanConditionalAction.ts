// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class BotmanConditionalAction extends pulumi.CustomResource {
    /**
     * Get an existing BotmanConditionalAction resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BotmanConditionalActionState, opts?: pulumi.CustomResourceOptions): BotmanConditionalAction {
        return new BotmanConditionalAction(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/botmanConditionalAction:BotmanConditionalAction';

    /**
     * Returns true if the given object is an instance of BotmanConditionalAction.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BotmanConditionalAction {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BotmanConditionalAction.__pulumiType;
    }

    public /*out*/ readonly actionId!: pulumi.Output<string>;
    public readonly conditionalAction!: pulumi.Output<string>;
    public readonly configId!: pulumi.Output<number>;

    /**
     * Create a BotmanConditionalAction resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BotmanConditionalActionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BotmanConditionalActionArgs | BotmanConditionalActionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BotmanConditionalActionState | undefined;
            resourceInputs["actionId"] = state ? state.actionId : undefined;
            resourceInputs["conditionalAction"] = state ? state.conditionalAction : undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
        } else {
            const args = argsOrState as BotmanConditionalActionArgs | undefined;
            if ((!args || args.conditionalAction === undefined) && !opts.urn) {
                throw new Error("Missing required property 'conditionalAction'");
            }
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            resourceInputs["conditionalAction"] = args ? args.conditionalAction : undefined;
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["actionId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BotmanConditionalAction.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BotmanConditionalAction resources.
 */
export interface BotmanConditionalActionState {
    actionId?: pulumi.Input<string>;
    conditionalAction?: pulumi.Input<string>;
    configId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a BotmanConditionalAction resource.
 */
export interface BotmanConditionalActionArgs {
    conditionalAction: pulumi.Input<string>;
    configId: pulumi.Input<number>;
}
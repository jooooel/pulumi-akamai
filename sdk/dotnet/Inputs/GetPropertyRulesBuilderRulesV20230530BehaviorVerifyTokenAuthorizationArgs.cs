// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        [Input("escapeHmacInputs")]
        public Input<bool>? EscapeHmacInputs { get; set; }

        [Input("failureResponse")]
        public Input<bool>? FailureResponse { get; set; }

        [Input("ignoreQueryString")]
        public Input<bool>? IgnoreQueryString { get; set; }

        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("location")]
        public Input<string>? Location { get; set; }

        [Input("locationId")]
        public Input<string>? LocationId { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("salt")]
        public Input<string>? Salt { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("transitionKey")]
        public Input<string>? TransitionKey { get; set; }

        [Input("useAdvanced")]
        public Input<bool>? UseAdvanced { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationInputArgs();
    }
}